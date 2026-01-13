package org.example.Repository;

import org.example.Model.Driver;

public class DriverRepository extends FileRepository<Driver, Integer> {
    public DriverRepository(String filename) {
        super(filename, Driver.class);
    }
}
