
/*
 * All rights Reserved, Designed By zhongj
 * @Description:
 * @author: zhongj
 * @date: 2025-04-02 23:38:02
 * @Copyright: 2025 www.featherfly.cn Inc. All rights reserved.
 */
package cn.featherfly.servlet;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.Map;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;
import javax.servlet.SessionCookieConfig;
import javax.servlet.SessionTrackingMode;
import javax.servlet.descriptor.JspConfigDescriptor;

/**
 * JavaxServletContext.
 *
 * @author zhongj
 */
public class JavaxServletContext implements ServletContext {

    private javax.servlet.ServletContext servletContext;

    /**
     * Instantiates a new javax servlet context.
     *
     * @param servletContext the servlet context
     */
    public JavaxServletContext(javax.servlet.ServletContext servletContext) {
        super();
        this.servletContext = servletContext;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServletContext getContext(String uripath) {
        return new JavaxServletContext(servletContext.getContext(uripath));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getContextPath() {
        return servletContext.getContextPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getMajorVersion() {
        return servletContext.getMajorVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getMinorVersion() {
        return servletContext.getMinorVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getEffectiveMajorVersion() {
        return servletContext.getEffectiveMajorVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getEffectiveMinorVersion() {
        return servletContext.getEffectiveMinorVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getMimeType(String file) {
        return servletContext.getMimeType(file);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<String> getResourcePaths(String path) {
        return servletContext.getResourcePaths(path);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public URL getResource(String path) throws MalformedURLException {
        return servletContext.getResource(path);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InputStream getResourceAsStream(String path) {
        return servletContext.getResourceAsStream(path);
    }

    /**
     * Gets the request dispatcher.
     *
     * @param path the path
     * @return the request dispatcher
     * @see javax.servlet.ServletContext#getRequestDispatcher(java.lang.String)
     */
    public RequestDispatcher getRequestDispatcher(String path) {
        return servletContext.getRequestDispatcher(path);
    }

    /**
     * Gets the named dispatcher.
     *
     * @param name the name
     * @return the named dispatcher
     * @see javax.servlet.ServletContext#getNamedDispatcher(java.lang.String)
     */
    public RequestDispatcher getNamedDispatcher(String name) {
        return servletContext.getNamedDispatcher(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void log(String msg) {
        servletContext.log(msg);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void log(String message, Throwable throwable) {
        servletContext.log(message, throwable);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRealPath(String path) {
        return servletContext.getRealPath(path);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getServerInfo() {
        return servletContext.getServerInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getInitParameter(String name) {
        return servletContext.getInitParameter(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Enumeration<String> getInitParameterNames() {
        return servletContext.getInitParameterNames();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean setInitParameter(String name, String value) {
        return servletContext.setInitParameter(name, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getAttribute(String name) {
        return servletContext.getAttribute(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Enumeration<String> getAttributeNames() {
        return servletContext.getAttributeNames();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setAttribute(String name, Object object) {
        servletContext.setAttribute(name, object);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeAttribute(String name) {
        servletContext.removeAttribute(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getServletContextName() {
        return servletContext.getServletContextName();
    }

    /**
     * Adds the servlet.
     *
     * @param servletName the servlet name
     * @param className the class name
     * @return the dynamic
     * @see javax.servlet.ServletContext#addServlet(java.lang.String, java.lang.String)
     */
    public Dynamic addServlet(String servletName, String className) {
        return servletContext.addServlet(servletName, className);
    }

    /**
     * Adds the servlet.
     *
     * @param servletName the servlet name
     * @param servlet the servlet
     * @return the dynamic
     * @see javax.servlet.ServletContext#addServlet(java.lang.String, javax.servlet.Servlet)
     */
    public Dynamic addServlet(String servletName, Servlet servlet) {
        return servletContext.addServlet(servletName, servlet);
    }

    /**
     * Adds the servlet.
     *
     * @param servletName the servlet name
     * @param servletClass the servlet class
     * @return the dynamic
     * @see javax.servlet.ServletContext#addServlet(java.lang.String, java.lang.Class)
     */
    public Dynamic addServlet(String servletName, Class<? extends Servlet> servletClass) {
        return servletContext.addServlet(servletName, servletClass);
    }

    /**
     * Adds the jsp file.
     *
     * @param servletName the servlet name
     * @param jspFile the jsp file
     * @return the dynamic
     * @see javax.servlet.ServletContext#addJspFile(java.lang.String, java.lang.String)
     */
    public Dynamic addJspFile(String servletName, String jspFile) {
        return servletContext.addJspFile(servletName, jspFile);
    }

    /**
     * Creates the servlet.
     *
     * @param <T> the generic type
     * @param clazz the clazz
     * @return the t
     * @throws ServletException the servlet exception
     * @see javax.servlet.ServletContext#createServlet(java.lang.Class)
     */
    public <T extends Servlet> T createServlet(Class<T> clazz) throws ServletException {
        return servletContext.createServlet(clazz);
    }

    /**
     * Gets the servlet registration.
     *
     * @param servletName the servlet name
     * @return the servlet registration
     * @see javax.servlet.ServletContext#getServletRegistration(java.lang.String)
     */
    public ServletRegistration getServletRegistration(String servletName) {
        return servletContext.getServletRegistration(servletName);
    }

    /**
     * Gets the servlet registrations.
     *
     * @return the servlet registrations
     * @see javax.servlet.ServletContext#getServletRegistrations()
     */
    public Map<String, ? extends ServletRegistration> getServletRegistrations() {
        return servletContext.getServletRegistrations();
    }

    /**
     * Adds the filter.
     *
     * @param filterName the filter name
     * @param className the class name
     * @return the javax.servlet. filter registration. dynamic
     * @see javax.servlet.ServletContext#addFilter(java.lang.String, java.lang.String)
     */
    public javax.servlet.FilterRegistration.Dynamic addFilter(String filterName, String className) {
        return servletContext.addFilter(filterName, className);
    }

    /**
     * Adds the filter.
     *
     * @param filterName the filter name
     * @param filter the filter
     * @return the javax.servlet. filter registration. dynamic
     * @see javax.servlet.ServletContext#addFilter(java.lang.String, javax.servlet.Filter)
     */
    public javax.servlet.FilterRegistration.Dynamic addFilter(String filterName, Filter filter) {
        return servletContext.addFilter(filterName, filter);
    }

    /**
     * Adds the filter.
     *
     * @param filterName the filter name
     * @param filterClass the filter class
     * @return the javax.servlet. filter registration. dynamic
     * @see javax.servlet.ServletContext#addFilter(java.lang.String, java.lang.Class)
     */
    public javax.servlet.FilterRegistration.Dynamic addFilter(String filterName, Class<? extends Filter> filterClass) {
        return servletContext.addFilter(filterName, filterClass);
    }

    /**
     * Creates the filter.
     *
     * @param <T> the generic type
     * @param clazz the clazz
     * @return the t
     * @throws ServletException the servlet exception
     * @see javax.servlet.ServletContext#createFilter(java.lang.Class)
     */
    public <T extends Filter> T createFilter(Class<T> clazz) throws ServletException {
        return servletContext.createFilter(clazz);
    }

    /**
     * Gets the filter registration.
     *
     * @param filterName the filter name
     * @return the filter registration
     * @see javax.servlet.ServletContext#getFilterRegistration(java.lang.String)
     */
    public FilterRegistration getFilterRegistration(String filterName) {
        return servletContext.getFilterRegistration(filterName);
    }

    /**
     * Gets the filter registrations.
     *
     * @return the filter registrations
     * @see javax.servlet.ServletContext#getFilterRegistrations()
     */
    public Map<String, ? extends FilterRegistration> getFilterRegistrations() {
        return servletContext.getFilterRegistrations();
    }

    /**
     * Gets the session cookie config.
     *
     * @return the session cookie config
     * @see javax.servlet.ServletContext#getSessionCookieConfig()
     */
    public SessionCookieConfig getSessionCookieConfig() {
        return servletContext.getSessionCookieConfig();
    }

    /**
     * Sets the session tracking modes.
     *
     * @param sessionTrackingModes the new session tracking modes
     * @see javax.servlet.ServletContext#setSessionTrackingModes(java.util.Set)
     */
    public void setSessionTrackingModes(Set<SessionTrackingMode> sessionTrackingModes) {
        servletContext.setSessionTrackingModes(sessionTrackingModes);
    }

    /**
     * Gets the default session tracking modes.
     *
     * @return the default session tracking modes
     * @see javax.servlet.ServletContext#getDefaultSessionTrackingModes()
     */
    public Set<SessionTrackingMode> getDefaultSessionTrackingModes() {
        return servletContext.getDefaultSessionTrackingModes();
    }

    /**
     * Gets the effective session tracking modes.
     *
     * @return the effective session tracking modes
     * @see javax.servlet.ServletContext#getEffectiveSessionTrackingModes()
     */
    public Set<SessionTrackingMode> getEffectiveSessionTrackingModes() {
        return servletContext.getEffectiveSessionTrackingModes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addListener(String className) {
        servletContext.addListener(className);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends EventListener> void addListener(T t) {
        servletContext.addListener(t);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addListener(Class<? extends EventListener> listenerClass) {
        servletContext.addListener(listenerClass);
    }

    /**
     * {@inheritDoc}
     */
    public <T extends EventListener> T createListener(Class<T> clazz) throws ServletException {
        return servletContext.createListener(clazz);
    }

    /**
     * {@inheritDoc}
     */
    public JspConfigDescriptor getJspConfigDescriptor() {
        return servletContext.getJspConfigDescriptor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassLoader getClassLoader() {
        return servletContext.getClassLoader();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void declareRoles(String... roleNames) {
        servletContext.declareRoles(roleNames);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getVirtualServerName() {
        return servletContext.getVirtualServerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getSessionTimeout() {
        return servletContext.getSessionTimeout();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setSessionTimeout(int sessionTimeout) {
        servletContext.setSessionTimeout(sessionTimeout);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRequestCharacterEncoding() {
        return servletContext.getRequestCharacterEncoding();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setRequestCharacterEncoding(String encoding) {
        servletContext.setRequestCharacterEncoding(encoding);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getResponseCharacterEncoding() {
        return servletContext.getResponseCharacterEncoding();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResponseCharacterEncoding(String encoding) {
        servletContext.setResponseCharacterEncoding(encoding);
    }
}
