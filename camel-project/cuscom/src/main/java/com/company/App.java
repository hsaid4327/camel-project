package com.company;

import org.apache.camel.builder.RouteBuilder;

public class App extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:inbound")
                .setHeader("NeedsApproval", method("netValueBean", "checkNetValueForApproval"))
                .choice()
                    .when(header("NeedsApproval").isEqualTo(true)).to("jms:queue:APPROVAL")
                    .otherwise().to("seda:transform");
    }
}
