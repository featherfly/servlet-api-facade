
/*
 * All rights Reserved, Designed By zhongj
 * @Description:
 * @author: zhongj
 * @date: 2025-04-02 23:54:02
 * @Copyright: 2025 www.featherfly.cn Inc. All rights reserved.
 */
package cn.featherfly.servlet.http;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.function.Supplier;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;

/**
 * JavaxHttpServletResponse.
 *
 * @author zhongj
 */
public class JavaxHttpServletResponse implements HttpServletResponse {

    private javax.servlet.http.HttpServletResponse httpServletResponse;

    /**
     * Instantiates a new javax http servlet response.
     *
     * @param httpServletResponse the http servlet response
     */
    public JavaxHttpServletResponse(javax.servlet.http.HttpServletResponse httpServletResponse) {
        super();
        this.httpServletResponse = httpServletResponse;
    }

    /**
     * Adds the cookie.
     *
     * @param cookie the cookie
     * @see javax.servlet.http.HttpServletResponse#addCookie(javax.servlet.http.Cookie)
     */
    public void addCookie(Cookie cookie) {
        httpServletResponse.addCookie(cookie);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean containsHeader(String name) {
        return httpServletResponse.containsHeader(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String encodeURL(String url) {
        return httpServletResponse.encodeURL(url);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCharacterEncoding() {
        return httpServletResponse.getCharacterEncoding();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String encodeRedirectURL(String url) {
        return httpServletResponse.encodeRedirectURL(url);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getContentType() {
        return httpServletResponse.getContentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void sendError(int sc, String msg) throws IOException {
        httpServletResponse.sendError(sc, msg);
    }

    /**
     * Gets the output stream.
     *
     * @return the output stream
     * @throws IOException Signals that an I/O exception has occurred.
     * @see javax.servlet.ServletResponse#getOutputStream()
     */
    public ServletOutputStream getOutputStream() throws IOException {
        return httpServletResponse.getOutputStream();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrintWriter getWriter() throws IOException {
        return httpServletResponse.getWriter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void sendError(int sc) throws IOException {
        httpServletResponse.sendError(sc);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setCharacterEncoding(String charset) {
        httpServletResponse.setCharacterEncoding(charset);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void sendRedirect(String location) throws IOException {
        httpServletResponse.sendRedirect(location);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setDateHeader(String name, long date) {
        httpServletResponse.setDateHeader(name, date);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setContentLength(int len) {
        httpServletResponse.setContentLength(len);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setContentLengthLong(long len) {
        httpServletResponse.setContentLengthLong(len);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addDateHeader(String name, long date) {
        httpServletResponse.addDateHeader(name, date);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setContentType(String type) {
        httpServletResponse.setContentType(type);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setHeader(String name, String value) {
        httpServletResponse.setHeader(name, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addHeader(String name, String value) {
        httpServletResponse.addHeader(name, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setBufferSize(int size) {
        httpServletResponse.setBufferSize(size);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setIntHeader(String name, int value) {
        httpServletResponse.setIntHeader(name, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addIntHeader(String name, int value) {
        httpServletResponse.addIntHeader(name, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setStatus(int sc) {
        httpServletResponse.setStatus(sc);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getBufferSize() {
        return httpServletResponse.getBufferSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void flushBuffer() throws IOException {
        httpServletResponse.flushBuffer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void resetBuffer() {
        httpServletResponse.resetBuffer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getStatus() {
        return httpServletResponse.getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCommitted() {
        return httpServletResponse.isCommitted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getHeader(String name) {
        return httpServletResponse.getHeader(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void reset() {
        httpServletResponse.reset();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<String> getHeaders(String name) {
        return httpServletResponse.getHeaders(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setLocale(Locale loc) {
        httpServletResponse.setLocale(loc);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<String> getHeaderNames() {
        return httpServletResponse.getHeaderNames();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setTrailerFields(Supplier<Map<String, String>> supplier) {
        httpServletResponse.setTrailerFields(supplier);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Locale getLocale() {
        return httpServletResponse.getLocale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Supplier<Map<String, String>> getTrailerFields() {
        return httpServletResponse.getTrailerFields();
    }
}
