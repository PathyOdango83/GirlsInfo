package com.girlsinfo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.girlsinfo.Model.ServicoModel;

@Repository
public interface ServicoRepository extends JpaRepository<ServicoModel, Long>{

}
