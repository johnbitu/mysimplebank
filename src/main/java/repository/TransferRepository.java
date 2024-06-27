package repository;

import models.Transfers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository <Transfers, String > {
}
