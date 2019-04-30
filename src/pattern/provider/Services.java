package pattern.provider;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// NonInstantiable class for registration and access
public class Services {

    private Services() {
    }

    private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();

    private static final String DEFAULT_PROVIDER_NAME = "<def>";

    // Provider register API
    public static void registerProvider(String name, Provider p) {
        providers.put(name, p);
    }

    public static void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }

    // Service access API
    public static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null) {
            throw new IllegalArgumentException("No service registered with name: " + name);
        }
        return p.newInterface();
    }

    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

}
