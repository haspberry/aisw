/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.46
 * Generated at: 2019-10-04 17:59:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model1.vo.Board;
import model1.dao.BoardDAO;
import java.util.ArrayList;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model1.vo.Board");
    _jspx_imports_classes.add("model1.dao.BoardDAO");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<meta name=\"Generator\" content=\"EditPlus®\">\r\n");
      out.write("\t\t<meta name=\"Author\" content=\"\">\r\n");
      out.write("\t\t<meta name=\"Keywords\" content=\"\">\r\n");
      out.write("\t\t<meta name=\"Description\" content=\"\">\r\n");
      out.write("\t\t<title>bbs</title>\r\n");
      out.write("\t\t<link href=\"./list.css\" rel=\"stylesheet\" type=\"text/css\" >\r\n");
      out.write("\t\t<title>게시판 - 목록 조회 화면</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<h1>게시판</h1>\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t<a href=\"../main.jsp\">로고</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"topnavi_ds\">\r\n");
      out.write("\t\t\t<div class=\"topnavi\">  \r\n");
      out.write("\t\t\t\t<a href=\"../intro/intro.jsp\">회사소개</a> |\t\r\n");
      out.write("\t\t\t\t<a href=\"./list.jsp\">게시판</a> | \r\n");
      out.write("\t\t\t\t<a href=\"../member/login.jsp\">로그인</a> |\r\n");
      out.write("\t\t\t\t <a href=\"../member/join.jsp\">회원가입</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"divide\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"body\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"default_tablestyle\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"100\">번호</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"\">제목</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"150\">작성자</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"300\">작성일</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"100\">조회수</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t");

        //게시판의 DataAccessObject(DAO) 객체 생성
        BoardDAO dao = new BoardDAO();
        //게시판 Object(객체) 선언
        Board vo = null;
        //게시판의 DataAccessObject(DAO)에 정의된 'getBoardList()' 메서드를 통해 => 게시물 정보 조회후, 받아오기
        ArrayList<Board> list = dao.getBoardList();
        
        for (int i=0; i < list.size(); i++) {  //초기값을 설정해주고 이 list의 행수 만큼 반복해서 중괄호 안에 있는 내용들이 반복들이 되서 소스가 나온다, 첫번째 array에 있는 것을 찾고 뽑아낸다 행수만큼
           vo = list.get(i);
		
      out.write("\r\n");
      out.write("               <tr>\r\n");
      out.write("                     <td align=\"center\">");
      out.print( vo.getBoardId() );
      out.write("</td>\r\n");
      out.write("                     <td align=\"center\"><a href=\"./view.jsp?boardId=");
      out.print( vo.getBoardId() );
      out.write('"');
      out.write('>');
      out.print( vo.getTitle() );
      out.write("</a></td>\r\n");
      out.write("                     <td align=\"center\">");
      out.print( vo.getCreater() );
      out.write("</td>\r\n");
      out.write("                     <td align=\"center\">");
      out.print( vo.getCreateDate() );
      out.write("</td>\r\n");
      out.write("                     <td align=\"center\">");
      out.print( vo.getReadCount() );
      out.write("</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("         ");

            }
         
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t<button onclick=\"window.location.href='./insert.jsp'\">등록</button>\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
