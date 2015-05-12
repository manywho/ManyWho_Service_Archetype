#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.actions;

import com.manywho.sdk.entities.describe.DescribeValue;
import com.manywho.sdk.entities.describe.DescribeValueCollection;
import com.manywho.sdk.enums.ContentType;
import com.manywho.sdk.services.describe.actions.AbstractAction;
import ${package}.types.ExampleOne;

public class Example extends AbstractAction {
    @Override
    public String getUriPart() {
        return "${artifactId}/${artifactId}";
    }

    @Override
    public String getDeveloperName() {
        return "Example";
    }

    @Override
    public String getDeveloperSummary() {
        return "This is an ${artifactId} action for a Service";
    }

    @Override
    public DescribeValueCollection getServiceInputs() {
        return new DescribeValueCollection() {{
            add(new DescribeValue("Example One", ContentType.Object, true, null, ExampleOne.NAME));
        }};
    }

    @Override
    public DescribeValueCollection getServiceOutputs() {
        return new DescribeValueCollection() {{
            add(new DescribeValue("Created?", ContentType.Boolean, true));
        }};
    }
}
