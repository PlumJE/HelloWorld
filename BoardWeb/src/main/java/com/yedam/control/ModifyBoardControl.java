package com.yedam.control;

import java.io.IOException;

import com.yedam.common.Control;
import com.yedam.jdbc.BoardDAO;
import com.yedam.vo.BoardVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ModifyBoardControl implements Control {
	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 수정화면에서 submit 이벤트가 발생하면 데이터베이스의 정보를 수정.
		// 정상적으로 수정이 완료되면 목록이동.
		// 수정에러가 발생하면 수정화면으로 이동.
		if (request.getMethod().equals("POST")) {
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			int boardNo = Integer.parseInt(request.getParameter("board_no"));
			
			BoardVO board = new BoardVO();
			board.setTitle(title);
			board.setContent(content);
			board.setBoardNo(boardNo);
			
			BoardDAO bdao = new BoardDAO();
			if (bdao.updateBoard(board)) {
				//response.sendRedirect("boardList.do");
				String addr = "board.do?board_no=" + boardNo;
				response.sendRedirect(addr);
			}
			else {
				//request.getRequestDispatcher("html/boardList.jsp").forward(request, response);
				String addr = "board.do?board_no=" + boardNo;
				response.sendRedirect(addr);
			}
		}
	}
}