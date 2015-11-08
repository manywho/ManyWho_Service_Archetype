#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.archetype;

import com.manywho.sdk.services.BaseApplication;
import com.manywho.sdk.services.ServiceBinder;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class Application extends BaseApplication {
    public Application() {
        registerSdk()
                .packages("${package}.archetype")
                .register(new ApplicationBinder())
                .register(new ServiceBinder());
    }
}
