package com.example.hospitalmanagementsystemspringbootrestapi.controller;
import javax.servlet.http.HttpServletRequest;

import com.example.hospitalmanagementsystemspringbootrestapi.model.Event;
import com.example.hospitalmanagementsystemspringbootrestapi.repository.EventJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
class CalendarApplication {

    @Autowired
    private EventJpaRepository eventRepository;

    @RequestMapping(value="/staticcalendar", method=RequestMethod.GET)
    public ModelAndView staticcalendar() {
        return new ModelAndView("staticcalendar");
    }

    @RequestMapping(value="/calendar", method=RequestMethod.GET)
    public ModelAndView calendar() {
        return new ModelAndView("calendar");
    }

    @RequestMapping(value="/jsoncalendar", method=RequestMethod.GET)
    public ModelAndView jsoncalendar() {
        return new ModelAndView("jsoncalendar");
    }

    @RequestMapping(value="/eventlist", method=RequestMethod.GET)
    public String events(HttpServletRequest request, Model model) {
        List<Event> event = eventRepository.findAll();
        model.addAttribute("events",event);
        return "allevents";
    }
}