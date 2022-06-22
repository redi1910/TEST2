package com.msc.B2Cconfig.datafetcher;

import com.msc.B2Cconfig.generated.graphql.DgsConstants;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;

@DgsComponent
public class MainFetcher {

    @DgsQuery(field = DgsConstants.QUERY.GraphqlSchemaExample)
    public String graphqlMain() {
        return "Welcome to graphql";
    }
}
