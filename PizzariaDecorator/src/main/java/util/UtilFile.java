/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.File;

/**
 *
 * @author jeanp
 */
public class UtilFile {
    
        public static String[] getAllPlugins() {
		File currentDir = new File("./plugins");
		String[] plugins = currentDir.list();
		return plugins;
	}
        
        public static String getDecoratorName(String filename) {
		return  filename.split("\\.")[0];
	}
        
        public static String getDecoratorPlugin(String filename) {
		String decoratorPlugin = getDecoratorName(filename).split("Decorator")[0];
		return decoratorPlugin;
	}
}
