package com.peaksoft.spring_boot.repo;

import com.peaksoft.spring_boot.model.GetId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GetIdRepository extends JpaRepository<GetId,Long>{
}
