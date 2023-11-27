package database;

import models.RumahSakit;

public class DatabaseRS {
    private static RumahSakit rumahSakit;
    
    public static RumahSakit getRumahSakit() {
        if (rumahSakit == null)
            rumahSakit = new RumahSakit();
        return rumahSakit;
    }
}
