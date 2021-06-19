package com.example.exampledatabase.RDB;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class RViewModel extends AndroidViewModel {
    RRepository rRepository;
    LiveData<List<RTable>> list;
    public RViewModel(@NonNull Application application) {
        super(application);
        rRepository = new RRepository(application);
        list = rRepository.readAllData();
    }
    /* This method to read data*/
    public LiveData<List<RTable>> readData(){
        return list;
    }
    // to update data
    public void update(RTable rTable){
        rRepository.update(rTable);
    }
    // to delete data
    public void delete(RTable rTable){
        rRepository.delete(rTable);
    }

    public void insert(RTable rTable) { rRepository.insert(rTable); }
}
