
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EtoServlet
 */
@WebServlet("/EtoServlet")
public class EtoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	final static String[] etos = new String[] {
			"子（ね）",
			"丑（うし）",
			"寅（とら）",
			"卯（う）",
			"辰（たつ）",
			"巳（み）",
			"午（うま）",
			"未（ひつじ）",
			"申（さる）",
			"酉（とり）",
			"戌（いぬ）",
			"亥（い）",
	};

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EtoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String yearStr = request.getParameter("year");
		int year = Integer.parseInt(yearStr);

		int index = (year + 8) % 12;
		String etoText = etos[index];

		response.setContentType("text/plain; charset=Windows-31J");
		PrintWriter out = response.getWriter();

		out.println("あなたの干支：" + etoText);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
