package com.wcci.musicstore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wcci.musicstore.Controllers.RecordStoreController;
import com.wcci.musicstore.Models.RecordStore;

@SpringBootTest
class MusicStoreApplicationTests {

	@Autowired
	private RecordStoreController recordStoreController;

	@Test
	public void testGetRecordStoreById() {
		RecordStore result = recordStoreController.getRecordStoreById(1l);
		assertEquals("The Exchange", result.getName(), "No Record Store with this name");
	}
}
