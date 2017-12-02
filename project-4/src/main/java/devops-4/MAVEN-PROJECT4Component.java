package devops-4;

import org.apache.camel.component.connector.DefaultConnectorComponent;

/**
 * Camel MAVEN-PROJECT4 connector
 */
public class MAVEN-PROJECT4Component extends DefaultConnectorComponent {
    
    public MAVEN-PROJECT4Component() {
        super("MAVEN-PROJECT4", "devops-4.MAVEN-PROJECT4Component");
    }

    public MAVEN-PROJECT4Component(String componentScheme) {
        super("MAVEN-PROJECT4", componentScheme, "devops-4.MAVEN-PROJECT4Component");
    }

}
