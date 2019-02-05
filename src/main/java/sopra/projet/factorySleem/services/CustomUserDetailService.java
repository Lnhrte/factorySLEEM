// package sopra.projet.factorySleem.services;
//
// import java.util.Optional;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import
// org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;
//
// import sopra.projet.factorySleem.model.User;
// import sopra.projet.factorySleem.repository.UserRepository;
//
// @Service
// public class CustomUserDetailService implements UserDetailsService {
//
// @Autowired
// private UserRepository userRepository;
//
// @Override
// public UserDetails loadUserByUsername(String arg0) throws
// UsernameNotFoundException {
// Optional<User> opt = userRepository.findByIdWithRoles(arg0);
//
// if (opt.isPresent()) {
// return new CustomUserDetails(opt.get());
// } else {
// throw new UsernameNotFoundException("utilisateur inconnu");
// }
// }
//
// }
