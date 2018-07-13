/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp;

/**
 * The AdaptiveCyberDefenseTokenResolverFactory class provides access to all
 * generated token resolvers. By giving the name of a defined token, the
 * corresponding resolve can be obtained. Despite the fact that this class is
 * called TokenResolverFactory is does NOT create new token resolvers whenever a
 * client calls methods to obtain a resolver. Rather, this class maintains a map
 * of all resolvers and creates each resolver at most once.
 */
public class AdaptiveCyberDefenseTokenResolverFactory implements org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolverFactory {
	
	private java.util.Map<String, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver> featureName2CollectInTokenResolver;
	private static org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver defaultResolver = new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.analysis.AdaptiveCyberDefenseDefaultTokenResolver();
	
	public AdaptiveCyberDefenseTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver>();
		registerTokenResolver("IDENTIFIER", new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.analysis.AdaptiveCyberDefenseIDENTIFIERTokenResolver());
		registerTokenResolver("INTEGER", new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.analysis.AdaptiveCyberDefenseINTEGERTokenResolver());
		registerTokenResolver("FLOAT", new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.analysis.AdaptiveCyberDefenseFLOATTokenResolver());
		registerTokenResolver("QUOTED_34_34", new org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.analysis.AdaptiveCyberDefenseQUOTED_34_34TokenResolver());
	}
	
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver internalCreateResolver(java.util.Map<String, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver> resolverMap, String key, org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
