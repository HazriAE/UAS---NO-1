package com.perpustkaan.perpus;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BukuService {

  @Autowired
    private BukuRepository bukuRepository;

    public List<Buku> getAllBuku() {
        return bukuRepository.findAll();
    }

    public Optional<Buku> getBukuById(Long id) {
        return bukuRepository.findById(id);
    }

    public Buku saveBuku(Buku buku) {
        return bukuRepository.save(buku);
    }

    public Buku updateBuku(Long id, Buku updatedBuku) {
        return bukuRepository.findById(id)
            .map(buku -> {
                buku.setJudul(updatedBuku.getJudul());
                buku.setPenulis(updatedBuku.getPenulis());
                buku.setTahunTerbit(updatedBuku.getTahunTerbit());
                return bukuRepository.save(buku);
            })
            .orElseGet(() -> {
                updatedBuku.setId(id);
                return bukuRepository.save(updatedBuku);
            });
    }

    public void deleteBuku(Long id) {
        bukuRepository.deleteById(id);
    }
}