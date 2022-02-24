package rosatom.autotests.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/credential.properties"
})
public interface CredentialConfig extends Config {
    String login();
    String password();
    @Key("url")
    String getUrl();
}
