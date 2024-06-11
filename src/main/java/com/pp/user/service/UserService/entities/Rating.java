package com.pp.user.service.UserService.entities;

import com.pp.user.service.UserService.services.impl.Hotel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    private String ratingId;
    private String userId;
    private String hotelId;
    private String rating;
    private String feedback;
    private Hotel hotel;

}
