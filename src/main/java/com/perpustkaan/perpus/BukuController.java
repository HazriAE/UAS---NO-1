package com.perpustkaan.perpus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/buku")
public class BukuController {

  @Autowired
  private BukuService bukuService;

  @GetMapping
  public List<Buku> getAllBuku() {
    return bukuService.getAllBuku();
  }

  @GetMapping("/{id}")
  public Optional<Buku> getBukuById(@PathVariable Long id) {
    return bukuService.getBukuById(id);
  }

  @PostMapping
  public Buku createBuku(@RequestBody Buku buku) {
    return bukuService.saveBuku(buku);
  }

  @PutMapping("/{id}")
  public Buku updateBuku(@PathVariable Long id, @RequestBody Buku buku) {
    return bukuService.updateBuku(id, buku);
  }

  @DeleteMapping("/{id}")
  public void deleteBuku(@PathVariable Long id) {
    bukuService.deleteBuku(id);
  }
}
