package com.edu.realestate.services;

import java.util.List;

import com.edu.realestate.exceptions.AuthenticationException;
import com.edu.realestate.exceptions.RealEstateException;
import com.edu.realestate.model.Advertisement;
import com.edu.realestate.model.Advertiser;
import com.edu.realestate.model.City;
import com.edu.realestate.model.Moderator;
import com.edu.realestate.model.RealEstate;
import com.edu.realestate.model.RealEstateType;
import com.edu.realestate.model.User;
import com.edu.realestate.services.mock.AdvertisementServiceMock;
import com.edu.realestate.services.mock.ReferenceServiceMock;
import com.edu.realestate.services.mock.UserServiceMock;

public class TestUserService {

	public static void main(String[] args) throws RealEstateException {
		UserService userService = new UserServiceMock();
		
		Moderator m = new Moderator ();
		m.setUsername("pascal");
		m.setPassword("pikachu2009");
		userService.register(m);
		
		Advertiser a = new Advertiser();
		a.setUsername("nabila");
		a.setPassword("getrich2019");
		a.setFirstName("Nabila");
		a.setLastName("Rachdi");
		
		userService.register(a);
		
		User u = null;
		
		try {
		u = userService.authenticate("pascal", "pikachu2009");
		System.out.println(u);
		
		u = userService.authenticate("nabila", "getrich2019");
		System.out.println(u);
		
		u = userService.authenticate("nabila", "mauvaismdp");
		System.out.println(u);
		}
		catch (AuthenticationException ae) {
			System.out.println("Cannot connect !!!" + ae.getMessage());
		}
		System.out.println(u);
		
		System.out.println("------------------------------------------------");
		
		
		ReferenceService referenceService = new ReferenceServiceMock();
        
        List<City> cities = referenceService.listCities();
        for (City cty : cities)
            System.out.println(cty);
        
        City firstCity = cities.get(0);
        
        System.out.println("-------------------------------------");
        System.out.println("Je cherche dans la ville" + firstCity.getName());
        System.out.println("-------------------------------------");
       
        System.out.println("ADS trouvés");
        AdvertisementService advertisementService = new AdvertisementServiceMock();
        List<Advertisement> adsInFirst = advertisementService.findAdvertisement(firstCity);
        for (Advertisement adFound: adsInFirst)
        System.out.println(adFound);
        
        System.out.println("-------------------------------------");
        
        RealEstateFactory ref = new RealEstateFactory();
        RealEstate Ho = ref.getRealEstate(RealEstateType.House, firstCity);
        System.out.println(Ho);
        
        RealEstate Ap = ref.getRealEstate(RealEstateType.Apartment);
        System.out.println(Ap);
        
	}

}
