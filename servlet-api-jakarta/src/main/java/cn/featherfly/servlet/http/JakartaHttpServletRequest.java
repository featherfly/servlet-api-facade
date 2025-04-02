
/*
 * All rights Reserved, Designed By zhongj
 * @Description:
 * @author: zhongj
 * @date: 2025-04-02 23:34:02
 * @Copyright: 2025 www.featherfly.cn Inc. All rights reserved.
 */
package cn.featherfly.servlet.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.DispatcherType;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletMapping;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpUpgradeHandler;
import jakarta.servlet.http.Part;

/**
 * JakartaHttpServletRequest.
 *
 * @author zhongj
 */
public class JakartaHttpServletRequest implements HttpServletRequest {

    private jakarta.servlet.http.HttpServletRequest httpServletRequest;

    /**
     * Instantiates a new javax http servlet request.
     *
     * @param httpServletRequest the http servlet request
     */
    public JakartaHttpServletRequest(jakarta.servlet.http.HttpServletRequest httpServletRequest) {
        super();
        this.httpServletRequest = httpServletRequest;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getAttribute(String name) {
        return httpServletRequest.getAttribute(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getAuthType() {
        return httpServletRequest.getAuthType();
    }

    /**
     * Gets the cookies.
     *
     * @return the cookies
     * @see jakarta.servlet.http.HttpServletRequest#getCookies()
     */
    public Cookie[] getCookies() {
        return httpServletRequest.getCookies();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Enumeration<String> getAttributeNames() {
        return httpServletRequest.getAttributeNames();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getDateHeader(String name) {
        return httpServletRequest.getDateHeader(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCharacterEncoding() {
        return httpServletRequest.getCharacterEncoding();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setCharacterEncoding(String env) throws UnsupportedEncodingException {
        httpServletRequest.setCharacterEncoding(env);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getHeader(String name) {
        return httpServletRequest.getHeader(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getContentLength() {
        return httpServletRequest.getContentLength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getContentLengthLong() {
        return httpServletRequest.getContentLengthLong();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Enumeration<String> getHeaders(String name) {
        return httpServletRequest.getHeaders(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getContentType() {
        return httpServletRequest.getContentType();
    }

    /**
     * Gets the input stream.
     *
     * @return the input stream
     * @throws IOException Signals that an I/O exception has occurred.
     * @see jakarta.servlet.ServletRequest#getInputStream()
     */
    public ServletInputStream getInputStream() throws IOException {
        return httpServletRequest.getInputStream();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Enumeration<String> getHeaderNames() {
        return httpServletRequest.getHeaderNames();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getParameter(String name) {
        return httpServletRequest.getParameter(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getIntHeader(String name) {
        return httpServletRequest.getIntHeader(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Enumeration<String> getParameterNames() {
        return httpServletRequest.getParameterNames();
    }

    /**
     * Gets the http servlet mapping.
     *
     * @return the http servlet mapping
     * @see jakarta.servlet.http.HttpServletRequest#getHttpServletMapping()
     */
    public HttpServletMapping getHttpServletMapping() {
        return httpServletRequest.getHttpServletMapping();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getParameterValues(String name) {
        return httpServletRequest.getParameterValues(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, String[]> getParameterMap() {
        return httpServletRequest.getParameterMap();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getProtocol() {
        return httpServletRequest.getProtocol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getScheme() {
        return httpServletRequest.getScheme();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getServerName() {
        return httpServletRequest.getServerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getServerPort() {
        return httpServletRequest.getServerPort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BufferedReader getReader() throws IOException {
        return httpServletRequest.getReader();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getMethod() {
        return httpServletRequest.getMethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getPathInfo() {
        return httpServletRequest.getPathInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRemoteAddr() {
        return httpServletRequest.getRemoteAddr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRemoteHost() {
        return httpServletRequest.getRemoteHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getPathTranslated() {
        return httpServletRequest.getPathTranslated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setAttribute(String name, Object o) {
        httpServletRequest.setAttribute(name, o);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getContextPath() {
        return httpServletRequest.getContextPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeAttribute(String name) {
        httpServletRequest.removeAttribute(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Locale getLocale() {
        return httpServletRequest.getLocale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Enumeration<Locale> getLocales() {
        return httpServletRequest.getLocales();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getQueryString() {
        return httpServletRequest.getQueryString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSecure() {
        return httpServletRequest.isSecure();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRemoteUser() {
        return httpServletRequest.getRemoteUser();
    }

    /**
     * Gets the request dispatcher.
     *
     * @param path the path
     * @return the request dispatcher
     * @see jakarta.servlet.ServletRequest#getRequestDispatcher(java.lang.String)
     */
    public RequestDispatcher getRequestDispatcher(String path) {
        return httpServletRequest.getRequestDispatcher(path);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isUserInRole(String role) {
        return httpServletRequest.isUserInRole(role);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Principal getUserPrincipal() {
        return httpServletRequest.getUserPrincipal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getRemotePort() {
        return httpServletRequest.getRemotePort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLocalName() {
        return httpServletRequest.getLocalName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRequestedSessionId() {
        return httpServletRequest.getRequestedSessionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLocalAddr() {
        return httpServletRequest.getLocalAddr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRequestURI() {
        return httpServletRequest.getRequestURI();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getLocalPort() {
        return httpServletRequest.getLocalPort();
    }

    /**
     * Gets the servlet context.
     *
     * @return the servlet context
     * @see jakarta.servlet.ServletRequest#getServletContext()
     */
    public ServletContext getServletContext() {
        return httpServletRequest.getServletContext();
    }

    /**
     * Start async.
     *
     * @return the async context
     * @throws IllegalStateException the illegal state exception
     * @see jakarta.servlet.ServletRequest#startAsync()
     */
    public AsyncContext startAsync() throws IllegalStateException {
        return httpServletRequest.startAsync();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StringBuffer getRequestURL() {
        return httpServletRequest.getRequestURL();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getServletPath() {
        return httpServletRequest.getServletPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HttpSession getSession(boolean create) {
        return new JakartaHttpSession(httpServletRequest.getSession(create));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HttpSession getSession() {
        return new JakartaHttpSession(httpServletRequest.getSession());
    }

    /**
     * Start async.
     *
     * @param servletRequest the servlet request
     * @param servletResponse the servlet response
     * @return the async context
     * @throws IllegalStateException the illegal state exception
     * @see jakarta.servlet.ServletRequest#startAsync(jakarta.servlet.ServletRequest,
     *      jakarta.servlet.ServletResponse)
     */
    public AsyncContext startAsync(ServletRequest servletRequest, ServletResponse servletResponse)
        throws IllegalStateException {
        return httpServletRequest.startAsync(servletRequest, servletResponse);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String changeSessionId() {
        return httpServletRequest.changeSessionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isRequestedSessionIdValid() {
        return httpServletRequest.isRequestedSessionIdValid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isRequestedSessionIdFromCookie() {
        return httpServletRequest.isRequestedSessionIdFromCookie();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isRequestedSessionIdFromURL() {
        return httpServletRequest.isRequestedSessionIdFromURL();
    }

    /**
     * Authenticate.
     *
     * @param response the response
     * @return true, if successful
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws ServletException the servlet exception
     * @see jakarta.servlet.http.HttpServletRequest#authenticate(jakarta.servlet.http.HttpServletResponse)
     */
    public boolean authenticate(HttpServletResponse response) throws IOException, ServletException {
        return httpServletRequest.authenticate(response);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isAsyncStarted() {
        return httpServletRequest.isAsyncStarted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isAsyncSupported() {
        return httpServletRequest.isAsyncSupported();
    }

    /**
     * Login.
     *
     * @param username the username
     * @param password the password
     * @throws ServletException the servlet exception
     * @see jakarta.servlet.http.HttpServletRequest#login(java.lang.String, java.lang.String)
     */
    public void login(String username, String password) throws ServletException {
        httpServletRequest.login(username, password);
    }

    /**
     * Gets the async context.
     *
     * @return the async context
     * @see jakarta.servlet.ServletRequest#getAsyncContext()
     */
    public AsyncContext getAsyncContext() {
        return httpServletRequest.getAsyncContext();
    }

    /**
     * Gets the dispatcher type.
     *
     * @return the dispatcher type
     * @see jakarta.servlet.ServletRequest#getDispatcherType()
     */
    public DispatcherType getDispatcherType() {
        return httpServletRequest.getDispatcherType();
    }

    /**
     * Logout.
     *
     * @throws ServletException the servlet exception
     * @see jakarta.servlet.http.HttpServletRequest#logout()
     */
    public void logout() throws ServletException {
        httpServletRequest.logout();
    }

    /**
     * Gets the parts.
     *
     * @return the parts
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws ServletException the servlet exception
     * @see jakarta.servlet.http.HttpServletRequest#getParts()
     */
    public Collection<Part> getParts() throws IOException, ServletException {
        return httpServletRequest.getParts();
    }

    /**
     * Gets the part.
     *
     * @param name the name
     * @return the part
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws ServletException the servlet exception
     * @see jakarta.servlet.http.HttpServletRequest#getPart(java.lang.String)
     */
    public Part getPart(String name) throws IOException, ServletException {
        return httpServletRequest.getPart(name);
    }

    /**
     * Upgrade.
     *
     * @param <T> the generic type
     * @param handlerClass the handler class
     * @return the t
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws ServletException the servlet exception
     * @see jakarta.servlet.http.HttpServletRequest#upgrade(java.lang.Class)
     */
    public <T extends HttpUpgradeHandler> T upgrade(Class<T> handlerClass) throws IOException, ServletException {
        return httpServletRequest.upgrade(handlerClass);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, String> getTrailerFields() {
        return httpServletRequest.getTrailerFields();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isTrailerFieldsReady() {
        return httpServletRequest.isTrailerFieldsReady();
    }

}
