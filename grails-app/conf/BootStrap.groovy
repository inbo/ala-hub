
class BootStrap {
    def grailsApplication

    def init = { servletContext ->
        log.info "config.security.cas = ${grailsApplication.config.security.cas}"
        log.info "config.ala.skin = ${grailsApplication.config.ala.skin}"
        log.info "config.biocache.ajax.useProxy = ${grailsApplication.config.biocache.ajax.useProxy}"
        log.info "config.grails.serverURL = ${grailsApplication.config.grails.serverURL}"
    }
    def destroy = {
    }
}
