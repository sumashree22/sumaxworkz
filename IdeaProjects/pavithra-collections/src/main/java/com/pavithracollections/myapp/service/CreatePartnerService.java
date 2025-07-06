package com.pavithracollections.myapp.service;

import com.pavithracollections.myapp.dto.DistributersPartnerDto;

public interface CreatePartnerService {
boolean validatePartnerAndSave(DistributersPartnerDto  dto);
}
