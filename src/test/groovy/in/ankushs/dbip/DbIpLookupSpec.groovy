package in.ankushs.dbip

import in.ankushs.dbip.api.DbIpClient
import in.ankushs.dbip.api.GeoEntity

class DbIpLookupSpec extends BaseSpec{
	
	
	//Format City,State,Country
	def "New Delhi,Delhi,India"(){
		given:
			def client = new DbIpClient(file)
		when:
			def ip = "59.178.193.100"
			GeoEntity geoEntity = client.lookup(ip)
			
		then:
			geoEntity.city == 'New Delhi'
			geoEntity.country == 'India'
			geoEntity.province == 'Delhi'
	}
	
	def "Mézin,Aquitaine-Limousin-Poitou-Charentes,France"(){
		given:
			def client = new DbIpClient(file)
		when:
			def ip = "90.31.200.197"
			GeoEntity geoEntity = client.lookup(ip)
		then:
			geoEntity.city == 'Bourlens'
			geoEntity.country == 'France'
			geoEntity.province == 'Aquitaine'
	}
	
	def "Columbus,Ohio,United States"(){
		given:
			def client = new DbIpClient(file)
		when:
			def ip = "164.249.132.41"
			GeoEntity geoEntity = client.lookup(ip)
		then:
			geoEntity.city == 'Columbus'
			geoEntity.country == 'United States'
			geoEntity.province == 'Ohio'
	}
	
	def "Newark,New Jersey,United States"(){
		given:
			def client = new DbIpClient(file)
		when:
			def ip = "48.180.50.198"
			GeoEntity geoEntity = client.lookup(ip)
		then:
			geoEntity.city == 'Newark'
			geoEntity.country == 'United States'
			geoEntity.province == 'New Jersey'
	}
	
	def "Lisbon,Lisbon District,Portugal"(){
		given:
			def client = new DbIpClient(file)
		when:
			def ip = "82.154.109.118"
			GeoEntity geoEntity = client.lookup(ip)
		then:
			geoEntity.city == 'Lisbon'
			geoEntity.country == 'Portugal'
			geoEntity.province == 'Lisbon District'
	}
	
	def "Melbourne,Victoria,Australia"(){
		given:
			def client = new DbIpClient(file)
		when:
			def ip = "49.199.255.255"
			GeoEntity geoEntity = client.lookup(ip)
		then:
			geoEntity.city == 'Melbourne'
			geoEntity.country == 'Australia'
			geoEntity.province == 'Victoria'
	}
	
	def "Auckland,Auckland,New Zealand"(){
		given:
			def client = new DbIpClient(file)
		when:
			def ip = "222.152.255.255"
			GeoEntity geoEntity = client.lookup(ip)
		then:
			geoEntity.city == 'Auckland'
			geoEntity.country == 'New Zealand'
			geoEntity.province == 'Auckland'
	}
	
	def "Yekaterinburg,Sverdlovsk Oblast,Russian Federation"(){
		given:
			def client = new DbIpClient(file)
		when:
			def ip = "5.2.63.255"
			GeoEntity geoEntity = client.lookup(ip)
		then:
			geoEntity.city == 'Yekaterinburg'
			geoEntity.country == 'Russian Federation'
			geoEntity.province == 'Sverdlovsk Oblast'
	}
	
	def "Yekaterinburg,Sverdlovsk Oblast,Sri Lanka"(){
		given:
			def client = new DbIpClient(file)
		when:
			def ip = "112.135.255.255"
			GeoEntity geoEntity = client.lookup(ip)
		then:
			geoEntity.city == 'Colombo'
			geoEntity.country == 'Sri Lanka'
			geoEntity.province == 'Western Province'
	}
	
	def "Dunker,Södermanland County,Sweden"(){
		given:
		def client = new DbIpClient(file)
	when:
		def ip = "5.133.223.255"
		GeoEntity geoEntity = client.lookup(ip)
	then:
		geoEntity.city == 'Dunker'
		geoEntity.country == 'Sweden'
		geoEntity.province == 'Södermanland County'
	}
	
	def "Oslo,Oslo,Norway"(){
		given:
		def client = new DbIpClient(file)
	when:
		def ip = "31.45.127.255"
		GeoEntity geoEntity = client.lookup(ip)
	then:
		geoEntity.city == 'Oslo'
		geoEntity.country == 'Norway'
		geoEntity.province == 'Oslo'
	}
	
	def "London,England,United Kingdom"(){
		given:
		def client = new DbIpClient(file)
	when:
		def ip = "31.48.109.127"
		GeoEntity geoEntity = client.lookup(ip)
	then:
		geoEntity.city == 'London'
		geoEntity.country == 'United Kingdom'
		geoEntity.province == 'England'
	}
	
	def "Paris,Ile-de-france,France"(){
		given:
		def client = new DbIpClient(file)
	when:
		def ip = "194.3.31.52"
		GeoEntity geoEntity = client.lookup(ip)
	then:
		geoEntity.city == 'Paris'
		geoEntity.country == 'France'
		geoEntity.province == 'Ile-de-france'
	}
	
	def "Qasr an Nile,Cairo Governorate,Egypt"(){
		given:
		def client = new DbIpClient(file)
	when:
		def ip = "197.55.197.243"
		GeoEntity geoEntity = client.lookup(ip)
	then:
		geoEntity.city == 'Qasr an Nile'
		geoEntity.country == 'Egypt'
		geoEntity.province == 'Cairo Governorate'
	}
	
	def "Seoul,Seoul,Korea, Republic of"(){
		given:
		def client = new DbIpClient(file)
	when:
		def ip = "211.232.184.31"
		GeoEntity geoEntity = client.lookup(ip)
	then:
		geoEntity.city == 'Seoul'
		geoEntity.country == "'Korea, Republic of'"
		geoEntity.province == 'Seoul'
	}
	
	def "Florence,Tuscany,Italy"(){
		given:
		def client = new DbIpClient(file)
	when:
		def ip = "31.196.74.119"
		GeoEntity geoEntity = client.lookup(ip)
	then:
		geoEntity.city == 'Florence'
		geoEntity.country == "Italy"
		geoEntity.province == 'Tuscany'
	}
	
	def "Amsterdam,North Holland,Netherlands"(){
		given:
		def client = new DbIpClient(file)
	when:
		def ip = "92.68.194.100"
		GeoEntity geoEntity = client.lookup(ip)
	then:
		geoEntity.city == 'Amsterdam'
		geoEntity.country == "Netherlands"
		geoEntity.province == 'North Holland'
	}
	//1
	def "Bangkok,จังหวัด กรุงเทพมหานคร,Thailand"(){
		given:
		def client = new DbIpClient(file)
	when:
		def ip = "1.0.255.255"
		GeoEntity geoEntity = client.lookup(ip)
	then:
		geoEntity.city == 'Bangkok'
		geoEntity.country == "Thailand"
		geoEntity.province == 'จังหวัด กรุงเทพมหานคร'
	}
	
	def "Minato,Tokyo,Japan"(){
		given:
		def client = new DbIpClient(file)
	when:
		def ip = "1.1.112.245"
		GeoEntity geoEntity = client.lookup(ip)
	then:
		geoEntity.city == 'Minato'
		geoEntity.country == "Japan"
		geoEntity.province == 'Tokyo'
	}
	
	def "Ahmedabad,Gujarat,India"(){
		given:
		def client = new DbIpClient(file)
	when:
		def ip = "1.23.30.240"
		GeoEntity geoEntity = client.lookup(ip)
	then:
		geoEntity.city == 'Ahmedabad'
		geoEntity.country == "India"
		geoEntity.province == 'Gujarat'
	}
	def "Adelaide,South Australia,Australia"(){
		given:
		def client = new DbIpClient(file)
	when:
		def ip = "1.123.166.1"
		GeoEntity geoEntity = client.lookup(ip)
	then:
		geoEntity.city == 'Adelaide'
		geoEntity.country == "Australia"
		geoEntity.province == 'South Australia'
	}
	
	def "Minsyong Township,Chiayi County,'Taiwan, Province Of China'"(){
		given:
		def client = new DbIpClient(file)
	when:
		def ip = "1.170.171.25"
		GeoEntity geoEntity = client.lookup(ip)
	then:
		geoEntity.city == 'Minsyong Township'
		geoEntity.country == "'Taiwan, Province Of China'"
		geoEntity.province == 'Chiayi County'
	}
	
	def "Roma,Lazio,Italy"(){
		given:
		def client = new DbIpClient(file)
	when:
		def ip = "2.40.217.22"
		GeoEntity geoEntity = client.lookup(ip)
	then:
		geoEntity.city == 'Roma'
		geoEntity.country == "Italy"
		geoEntity.province == 'Lazio'
	}
	
	def "Matamoros,Tamaulipas,Mexico"(){
		given:
		def client = new DbIpClient(file)
	when:
		def ip = "189.159.147.1"
		GeoEntity geoEntity = client.lookup(ip)
	then:
		geoEntity.city == 'Matamoros'
		geoEntity.country == "Mexico"
		geoEntity.province == 'Tamaulipas'
	}
	

}	
