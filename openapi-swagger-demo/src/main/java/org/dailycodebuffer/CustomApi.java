package org.dailycodebuffer;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.core.Application;

@OpenAPIDefinition(
        tags = {
                @Tag(name="Extra Menu", description="This API has nothing yet")
        },
        info = @Info(
                title="Open API and Swagger Demo",
                version = "1.0.1",
                contact = @Contact(
                        name = "Daily Code Buffer",
                        url = "http://www.dailycodebuffer.com/contact/",
                        email = "suppoert@dailycodebuffer.com"),
                license = @License(
                        name = "Apache 2.0",
                        url = "http://www.apache.org/licenses/LICENSE-2.0.html"))
)
public class CustomApi extends Application {
}
