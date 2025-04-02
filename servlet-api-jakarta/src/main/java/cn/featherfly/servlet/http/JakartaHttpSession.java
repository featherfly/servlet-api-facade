
/*
 * All rights Reserved, Designed By zhongj
 * @Description:
 * @author: zhongj
 * @date: 2025-04-02 23:35:02
 * @Copyright: 2025 www.featherfly.cn Inc. All rights reserved.
 */
package cn.featherfly.servlet.http;

import java.util.Enumeration;

import cn.featherfly.servlet.JakartaServletContext;
import cn.featherfly.servlet.ServletContext;

/**
 * JakartaHttpSession.
 *
 * @author zhongj
 */
public class JakartaHttpSession implements HttpSession {

    private jakarta.servlet.http.HttpSession httpSession;

    /**
     * Instantiates a new jakarta http session.
     *
     * @param httpSession the http session
     */
    public JakartaHttpSession(jakarta.servlet.http.HttpSession httpSession) {
        super();
        this.httpSession = httpSession;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getCreationTime() {
        return httpSession.getCreationTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getId() {
        return httpSession.getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getLastAccessedTime() {
        return httpSession.getLastAccessedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServletContext getServletContext() {
        return new JakartaServletContext(httpSession.getServletContext());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setMaxInactiveInterval(int interval) {
        httpSession.setMaxInactiveInterval(interval);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getMaxInactiveInterval() {
        return httpSession.getMaxInactiveInterval();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getAttribute(String name) {
        return httpSession.getAttribute(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Enumeration<String> getAttributeNames() {
        return httpSession.getAttributeNames();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setAttribute(String name, Object value) {
        httpSession.setAttribute(name, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeAttribute(String name) {
        httpSession.removeAttribute(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void invalidate() {
        httpSession.invalidate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isNew() {
        return httpSession.isNew();
    }
}
