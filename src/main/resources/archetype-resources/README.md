#set ( $h = "#")
service-${artifactId}
=====================

${h}${h}${h} Building

To build the application, you will need to have Maven 3 and a Java 8 implementation installed (OpenJDK and Oracle Java SE
are both supported).

Now you can build the runnable shaded JAR:

```bash
$ mvn clean package
```

${h}${h}${h} Running

The application is a RestEASY JAX-RS application, that by default is run under the Jetty server on port 8080 (if you
use the packaged JAR).

${h}${h}${h}${h} Defaults

Running the following command will start the service listening on `0.0.0.0:8080`:

```bash
$ java -jar target/service-${artifactId}.jar
```

${h}${h}${h}${h} Heroku

This service is compatible with Heroku, and can be deployed by:

```bash
# If you've never logged in with Heroku via the CLI
$ heroku login

# Create an app for the service in Heroku, and add the Git remote
$ heroku create

# Deploy the app
$ git push heroku master
```

More information can be found [here](https://devcenter.heroku.com/categories/java).