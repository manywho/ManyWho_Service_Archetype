#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.archetype.services;

import com.manywho.sdk.entities.run.elements.type.ObjectCollection;
import com.manywho.sdk.entities.run.elements.type.ObjectDataResponse;
import ${package}.archetype.configuration.Configuration;

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
