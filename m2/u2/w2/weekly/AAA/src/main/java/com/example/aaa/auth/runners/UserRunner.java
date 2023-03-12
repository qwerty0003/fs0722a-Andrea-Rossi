package com.example.aaa.auth.runners;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.aaa.auth.devices.Device;
import com.example.aaa.auth.devices.DeviceRepo;
import com.example.aaa.auth.devices.EState;
import com.example.aaa.auth.devices.EType;
import com.example.aaa.auth.roles.ERole;
import com.example.aaa.auth.roles.Role;
import com.example.aaa.auth.roles.RoleRepository;
import com.example.aaa.auth.users.User;
import com.example.aaa.auth.users.UserRepository;

@Component
public class UserRunner implements ApplicationRunner {
	
	@Autowired RoleRepository roleRepository;
	@Autowired UserRepository userRepository;
	@Autowired DeviceRepo deviceRepository;
	@Autowired PasswordEncoder encoder;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Role admin = new Role();
		admin.setRoleName(ERole.ROLE_ADMIN);
		//roleRepository.save(admin);
		
		Role user = new Role();
		user.setRoleName(ERole.ROLE_USER);
		//roleRepository.save(user);
		
		Role moderator = new Role();
		moderator.setRoleName(ERole.ROLE_MODERATOR);
		//roleRepository.save(moderator);
		
		Device phone = new Device();
		phone.setName("Xiaomi 12T PRO");
		phone.setState(EState.ASSEGNATO);
		phone.setType(EType.SMARTPHONE);
		//deviceRepository.save(phone);
		
		Device tablet = new Device();
		tablet.setName("IPAD PRO");
		tablet.setState(EState.ASSEGNATO);
		tablet.setType(EType.TABLET);
		//deviceRepository.save(tablet);
		
		Device laptop = new Device();
		laptop.setName("ALIENWARE AREA 51");
		laptop.setState(EState.IN_MANUTENZIONE);
		laptop.setType(EType.LAPTOP);
		//deviceRepository.save(laptop);
		
		Device laptop2 = new Device();
		laptop2.setName("Surface 2022");
		laptop2.setState(EState.DISPONIBILE);
		laptop2.setType(EType.LAPTOP);
		//deviceRepository.save(laptop2);

		
		Set<Role> adminRole = new HashSet<Role>();
		adminRole.add(admin);
		adminRole.add(moderator);
		adminRole.add(user);
		
		Set<Role> moderatorRole = new HashSet<Role>();
		moderatorRole.add(moderator);
		moderatorRole.add(user);
		
		Set<Role> userRole = new HashSet<Role>();
		userRole.add(user);
		
		Set<Device> userDevice = new HashSet<Device>();
		userDevice.add(laptop);
		
		Set<Device> adminDevice = new HashSet<Device>();
		adminDevice.add(tablet);
		adminDevice.add(phone);
		
		
		
		User userAdmin = new User();
		userAdmin.setNome("SUPER");
		userAdmin.setCognome("HERO");
		userAdmin.setUsername("ADMIN");
		userAdmin.setEmail("admin@example.com");
		userAdmin.setPassword(encoder.encode("admin"));
		userAdmin.setRoles(adminRole);
		userAdmin.setDevices(adminDevice);
		
		//userRepository.save(userAdmin);
		
		User simpleUser = new User();
		simpleUser.setNome("Dumb");
		simpleUser.setCognome("Guy");
		simpleUser.setUsername("average00");
		simpleUser.setEmail("guyguy@example.com");
		simpleUser.setPassword(encoder.encode("12345"));
		simpleUser.setRoles(userRole);
		simpleUser.setDevices(userDevice);
		//userRepository.save(simpleUser);
		
		User userModerator = new User();
		userModerator.setNome("Beppe");
		userModerator.setCognome("Verdi");
		userModerator.setUsername("peppino");
		userModerator.setEmail("verdi.b@example.com");
		userModerator.setPassword(encoder.encode("qwerty"));
		userModerator.setRoles(moderatorRole);
		//userRepository.save(userModerator);
	}

}
