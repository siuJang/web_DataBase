package com.web.p5;
import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class product {
@Id public Integer ordernum;
public String id;
public String fishingrod;
public Integer buynum;
@CreationTimestamp public LocalDateTime rdate;
} // class