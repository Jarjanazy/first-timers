package jalil.demo.firstTimers.router;

import jalil.demo.firstTimers.post.handler.PostHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class RouterFunctionConfig {

    @Bean
    public RouterFunction<ServerResponse> router(PostHandler postHandler){
        return RouterFunctions.
                route(GET("functional/post").
                        and(accept(MediaType.APPLICATION_JSON)),
                        postHandler::postHandler);
    }
}
