package com.speed.models.Media

import com.speed.models.Hosts.Host

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToMany
import javax.persistence.OneToOne
import javax.persistence.Table


@Entity
@Table(name="HOST_MEDIA")
class HostMedia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int hostMediaID

    @OneToOne
    private Host host

    @OneToOne
    private Media media
}
