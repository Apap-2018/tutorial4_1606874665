package com.apap.tutorial4.service;

import java.util.List;
import java.util.Optional;
import com.apap.tutorial4.model.DealerModel;

/**
 * DealerService
 * */

public interface DealerService {
	Optional<DealerModel> getDealerDetailById(Long id);
	
	void addDealer(DealerModel dealer);
	void deleteDealer(DealerModel dealer);
	List<DealerModel> getAllDetailDealer();
	void updateDealer(long id, Optional<DealerModel> dealer);
}
