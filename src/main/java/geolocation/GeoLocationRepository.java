package geolocation;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class GeoLocationRepository {

    private List<GeoLocation> geolocations = new ArrayList<>();

    public void addGeoLocation(GeoLocation geoLocation) {
        geolocations.add(geoLocation);
    }

    public List<GeoLocation> getGeolocations() {
        return Collections.unmodifiableList(geolocations);
    }
}
