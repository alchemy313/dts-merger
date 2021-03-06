package com.cozystay.model;

import java.util.List;

public interface SyncTask extends Cloneable {

    boolean allOperationsCompleted();

    boolean canMergeStatus(SyncOperation operation);

    SyncOperation firstOperation();

    SyncTask merge(SyncTask task);

    SyncTask mergeStatus(SyncTask task);

    SyncTask deepMerge(SyncTask task);

    String getId();

    String getDatabase();

    String getTable();

    List<SyncOperation> getOperations();

    void addOperation(SyncOperation operation);

}
