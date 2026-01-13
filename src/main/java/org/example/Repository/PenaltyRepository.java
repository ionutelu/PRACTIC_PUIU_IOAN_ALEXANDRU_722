package org.example.Repository;

import org.example.Model.Penalty;

public class PenaltyRepository extends FileRepository<Penalty, Integer> {
    public PenaltyRepository(String filename) {
        super(filename, Penalty.class);
    }
}
