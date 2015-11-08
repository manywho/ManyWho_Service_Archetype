#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.services;

import com.manywho.sdk.entities.run.elements.type.ObjectCollection;
import com.manywho.sdk.entities.run.elements.type.ObjectDataResponse;
import ${package}.${artifactId}.configuration.Configuration;

public class DataService {
    public ObjectDataResponse loadExamples(Configuration configurationValues) {
        // Load some data from a database or API, then convert back into ManyWho Objects (ObjectCollection)

        return new ObjectDataResponse();
    }

    public ObjectDataResponse saveExample(Configuration configurationValues, ObjectCollection objectData) {
        // Save some data to a database or API

        return new ObjectDataResponse();
    }
}
