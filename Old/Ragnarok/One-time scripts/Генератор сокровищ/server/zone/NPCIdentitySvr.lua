
dofile( [[NPCIdentity.lua]] );

function main()

	local tbl={
	{jobtbl.JT_E_ZOMBIE_PIRATE ,[[E_ZOMBIE_PIRATE]], [[E_ZOMBIE_PIRATE]]},
	{jobtbl.JT_E_ZOMBIE_CAPTAIN ,[[E_ZOMBIE_CAPTAIN]], [[E_ZOMBIE_CAPTAIN]]},
	{jobtbl.JT_E_ZOMBIE_TREASURE ,[[E_ZOMBIE_TREASURE]], [[E_ZOMBIE_TREASURE]]},
	};																
																							
	for k,v in pairs(tbl) do
		result,msg = settable(v[1],v[2],v[3]);
		if( not result) then return false,msg; end		
	end	
	
	return true, [[success]] ;	
	
end



