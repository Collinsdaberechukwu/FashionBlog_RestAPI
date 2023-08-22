package com.example.mini_projectfashionblogapi.service.Implementation;

import com.example.mini_projectfashionblogapi.DTOs.AdminDto;
import com.example.mini_projectfashionblogapi.model.Admin;
import com.example.mini_projectfashionblogapi.repository.AdminRepo;
import com.example.mini_projectfashionblogapi.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AdminImplementation implements AdminService {
    private final AdminRepo adminRepo;

    @Override
    public Admin postDesign(AdminDto adminDto) {
        Admin post = new Admin();
        post.setFirstName(adminDto.getFirstName());
        post.setLastName(adminDto.getLastName());
        post.setId(adminDto.getId());

        return adminRepo.save(post);
    }

    @Override
    public void deleteProduct(AdminDto adminDto,Long id) {
        Admin delete = adminRepo.findById(id).orElseThrow(()-> new RuntimeException("Product not available at the moment try other product"));
        delete.setId(adminDto.getId());
        delete.getLastName(adminDto.s)
        adminRepo.delete(delete);
    }

//    @Override
//    public AdminDto updateProduct(AdminDto adminDto) {
////        Admin admin = adminRepo.findByUpdatedProduct();
////        admin.setUpdatedProduct(admin.getUpdatedProduct());
////        Admin updateProduct = adminRepo.save(admin);
////        return new AdminDto(updateProduct);
//        Admin admin = new Admin();
//        admin.setUpdatedProduct(admin.getUpdatedProduct());
//
//
//        Admin updatedProduct = adminRepo.save(admin);
//        return new AdminDto(updatedProduct);

//    Admin product = productRepo.findById(id)
//            .orElseThrow(() -> new RuntimeException("product not found re-type"));
//    }
}