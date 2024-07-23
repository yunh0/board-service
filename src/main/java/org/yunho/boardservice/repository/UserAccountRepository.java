package org.yunho.boardservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.yunho.boardservice.domain.UserAccount;
import org.yunho.boardservice.domain.projection.UserAccountProjection;

@RepositoryRestResource(excerptProjection = UserAccountProjection.class)
public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
}
