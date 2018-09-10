package ru.bolo

import org.springframework.boot.web.servlet.ServletContextInitializer
import org.springframework.context.annotation.Configuration
import javax.servlet.ServletContext

@Configuration
class H2Configurator : ServletContextInitializer {

    override fun onStartup(servletContext: ServletContext) {
        initH2Console(servletContext)
    }

    private fun initH2Console(servletContext: ServletContext) {
        val h2ConsoleServlet = servletContext.addServlet("H2Console", org.h2.server.web.WebServlet())
        h2ConsoleServlet.addMapping("/h2console/*")
        h2ConsoleServlet.setLoadOnStartup(1)
    }
}