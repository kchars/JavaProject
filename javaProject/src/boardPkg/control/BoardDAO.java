package boardPkg.control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import boardPkg.commom.DBcon;
import boardPkg.model.Board;

public class BoardDAO {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = null;

	public void close() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 전체리스트
	public Board[] selectBoards() {
		sql = "select * From board order by board_no desc";
		conn = DBcon.getConnection();
		Board[] boards = new Board[100];
		int i = 0;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				Board brd = new Board();
				brd.setBoardNo(rs.getInt("board_no"));
				brd.setTitle(rs.getString("title"));
				brd.setContent(rs.getString("content"));
				brd.setWriter(rs.getString("writer"));
				brd.setCreationDate(rs.getString("creation_date"));

				boards[i++] = brd;
			}
		} catch (SQLException e) {
			// e.printStackTrace();
			System.out.println("조회처리중에 에러가 발생했습니다.");
		} finally {
			// 정상실행/예외발생 -> 항상 실행해야할 내용이 있으면 구현.

		}
		return boards;
	}

	// 한건조회
	public Board selectBoard(int boardNo) {
		sql = "select * from board where board_no = " + boardNo;
		conn = DBcon.getConnection();
		Board brd = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				brd = new Board(rs.getInt("board_no")//
						, rs.getString("title")//
						, rs.getString("content")//
						, rs.getString("writer")//
						, rs.getString("creation_date"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return brd;
	}

	// 입력
	public void insertBoard(Board board) {
		conn = DBcon.getConnection();
		sql = "insert into board values("//
				+ board.getBoardNo()//
				+ ", '" + board.getTitle() + "'"//
				+ ", '" + board.getContent() + "'"//
				+ ", '" + board.getWriter() + "'"//
				+ ", sysdate"//
				+ ")";
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 입력되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	// 수정
	public void updateBoard(Board board) {
		conn = DBcon.getConnection();
		sql = "update board set content = '"//
				+ board.getContent()//
				+ "' where board_no  = " + board.getBoardNo()//
				;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("업데이트가 되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	// 삭제
	public void deleteBoard(Board board) {
		conn = DBcon.getConnection();
		sql = "delete from board where board_no = " + board.getBoardNo();
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("삭제 되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
	}

}
