package com.pavithracollections.myapp.service.impl;

import com.pavithracollections.myapp.dto.DistributersPartnerDto;
import com.pavithracollections.myapp.repository.CreatePartnerRepository;
import com.pavithracollections.myapp.repository.impl.CreatePartnerRepositoryimpl;
import com.pavithracollections.myapp.service.CreatePartnerService;


    public class CreatePartnerServiceImpl implements CreatePartnerService {

        private CreatePartnerRepository createPartnerRepository;

        public CreatePartnerServiceImpl() {
            this.createPartnerRepository = new CreatePartnerRepositoryimpl();
        }

        @Override
        public boolean validatePartnerAndSave(DistributersPartnerDto dto) {
            boolean isPartnerSaved = false;
            boolean isDistributerName = false;
            boolean isAdress = false;
            boolean isMobileNumber = false;
            boolean isEmailId = false;
            boolean isTotalCost = false;

            if (dto.getDistributerName() != null && !dto.getDistributerName().isEmpty()) {
                isDistributerName = true;
            }

            if (dto.getAdress() != null && !dto.getAdress().isEmpty()) {
                isAdress = true;
            }

            if (dto.getMobileNumber() != null && !dto.getMobileNumber().isEmpty()) {
                isMobileNumber = true;
            }

            if (dto.getEmailId() != null && !dto.getEmailId().isEmpty()) {
                isEmailId = true;
            }

            if (dto.getTotalCost() != null && !dto.getTotalCost().isEmpty()) {
                isTotalCost = true;
            }

            if (isDistributerName && isAdress && isMobileNumber && isEmailId && isTotalCost) {
                isPartnerSaved = createPartnerRepository.savePartner(dto);
            }

            return isPartnerSaved;
        }
    }


