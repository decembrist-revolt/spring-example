package org.decembrist.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.SequenceGenerator

@Entity
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_generator")
    @SequenceGenerator(name = "user_id_generator", sequenceName = "USER_SEQ_ID", allocationSize = 1)
    var id: Long? = null
    var email: String? = null
    var username: String? = null
    var password: String? = null
}
