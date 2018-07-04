package geolocation;

import java.util.List;

public interface GeoLocationService {

    GeoLocation create(GeoLocation geolocation);

    List<GeoLocation> findAll();
}
