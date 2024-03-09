package com.ase.aplicatienotite.baze_date.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.ase.aplicatienotite.clase.sectiune.Sectiune;

import java.util.List;

@Dao
public interface SectiuneDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertSectiune(Sectiune sectiune);
    @Delete
    void deleteSectiune(Sectiune sectiune);

    @Query("SELECT * FROM sectiuni")
    LiveData<List<Sectiune>> selectToateSectiuni();
}