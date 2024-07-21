package org.yunho.boardservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yunho.boardservice.domain.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
}
